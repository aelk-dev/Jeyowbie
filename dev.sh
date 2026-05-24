#!/bin/bash

# Load environment variables
export $(cat .env | xargs)

# Start database if not running
docker compose up -d

# Start backend
cd backend && ./mvnw spring-boot:run