import './App.css' 
import { useFoodData } from './hooks/useFoodData'
import { Card } from './components/card/card'

function App() {
  const {data} = useFoodData();

  return (
    <div className='container'>
      <h1>Cardápio</h1>
      <div className='card-grid'>
        {data?.map(foodData => 
          <Card key={foodData.id}
            price = {foodData.price} 
            title = {foodData.title} 
            image = {foodData.image}
          />
        )}
      </div>
    </div>
  )
}

export default App
