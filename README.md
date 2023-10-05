# Random Numbers Generator Web Application

## Table of Contents
- [Features](#features)
    - [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Testing](#testing)
- [Dockerization](#dockerization)
- [Git Pipeline](#git-pipeline)

## Features

The Random Numbers Generator Web Application is a simple Spring Boot web application that exposes an endpoint for generating a given number of random numbers within a specified interval. Features implemented:

- RESTful API with JSON response format to generate a specified number of random numbers within a defined interval.
- Easily deployable with Docker and Kubernetes.

### Technologies Used

- Spring Boot
- Docker
- Kubernetes
- GitHub Actions (CI/CD)

## Getting Started

To get started with the Random Numbers Generator Web Application, follow these steps:

1. **Clone the Repository**

```shell
git clone https://github.com/DavideRutigliano/challenge.git
```

2. **Build the Application**

Run the following command to build the application using Maven:

```shell
./mvnw clean install
```

3. **Run the Application**

Start the application by running the following command:

```shell
./mvnw spring-boot:run
```

The application will be accessible at `http://localhost:8080`.

Now you're ready to use the Random Numbers Generator Web Application. Follow the "Usage" section to generate random numbers with the provided API endpoint.

If you encounter any issues during setup or have questions, please refer to the documentation or seek assistance from the project contributors.

## Usage

To generate random numbers, make a GET request to /api/random with query parameters:

- count (required): The number of random numbers to generate.
- min (required): The minimum value of the interval.
- max (required): The maximum value of the interval.

`http://localhost:8080/generateRandomNumbers?count=5&min=1&max=100`

## Testing

Run the tests with the following command:

```shell
./mvnw test
```

## Dockerization

To build a Docker image for the application:

```shell
docker build -t random_numbers:latest .
```

To run the Docker container:

```shell
docker run -p 8080:8080 random_numbers:latest
```

## Git Pipeline

This project uses GitHub Actions for continuous integration (CI) and continuous deployment (CD).

The pipeline is automatically triggered on each push to the main branch and includes:

- Build application
- Run tests
- Build a Docker image
- Push the Docker image to the container registry