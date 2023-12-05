import { useQuery } from "@tanstack/react-query";
import axios, { AxiosPromise } from "axios"
import { FoodData } from "../interface/FoodData";

const API_URL = "http://localhost:8080"

const fechData = async (): AxiosPromise<FoodData[]> => {
    const response = axios.get(API_URL+ "/food")
    return response;
    }

export function useFoodData() {
  const query = useQuery({
    queryKey: ['food-data'],
    queryFn: fechData,
    retry: 2
  })

  return {
    ...query,
    data: query.data?.data
  }
  }
