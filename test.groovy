job('job_dsl_created') {
    // Define job properties and configuration here
    displayName('My DSL Created Job')
    description('This is a job created using Job DSL')
    
    steps {
        shell('echo "Hello, World!"')
    }
    
    // Add more job configuration as needed
}

