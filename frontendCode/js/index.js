window.onload=function(){
    const feedbackURL = "http://localhost:8083/feedback"
    const feedbackFormBtn = document.querySelector(".submit-feedback")

    feedbackFormBtn.addEventListener('click', postFeedback)

    function postFeedback() {
        let feedbackData = { description: "", rating: 0}

        const descriptionInput = document.querySelector(".description")
        const ratingInput = document.querySelector(".rating")
        feedbackData.description = descriptionInput.value
        feedbackData.rating = ratingInput.value

        const postForm = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(feedbackData)
        }

        fetch(feedbackURL, postForm)
            .then(r => r.json())
            .then(data => console.log(data))
    }

}


