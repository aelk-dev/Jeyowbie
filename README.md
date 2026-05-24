# Jeyowbie 🎯

A full-stack job application tracker built to manage your job search efficiently.

## Tech Stack

**Backend:** Java 25 · Spring Boot 3.5 · Spring Security · Flyway · PostgreSQL  
**Frontend:** React · TypeScript · Vite · Tailwind CSS  
**DevOps:** Docker · GitHub Actions

## Getting Started

### Prerequisites
- Docker
- Java 21+
- Node.js 20+

### Quick start (development)

```bash
./dev.sh
```

This script will automatically load environment variables, start the PostgreSQL database via Docker, and launch the Spring Boot backend.

### Run manually

1. Clone the repository
```bash
   git clone https://github.com/aelk-dev/Jeyowbie.git
   cd Jeyowbie
```

2. Create your environment file
```bash
   cp .env.example .env
```

3. Start the frontend
```bash
   cd frontend
   npm install
   npm run dev
```

## Status

🚧 In active development

## License

Copyright (c) 2026 Aya El Hakkouni — All rights reserved.  
This project is proprietary. Viewing and running locally for evaluation purposes is permitted.  
Any other use requires explicit written permission from the author.