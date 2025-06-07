
# Smart AI Suite

Smart AI Suite is a modular AI platform that integrates powerful language, vision, and data tools into a single, user-friendly application. It features a Spring Boot and Spring AI backend powered by Google Gemini, paired with a fast and responsive React + Vite frontend, optimized for both web and mobile.

![ss2](https://github.com/user-attachments/assets/60a52309-1e88-41ad-8674-991c24839fd2)
![ss1](https://github.com/user-attachments/assets/c42496b9-5d10-45eb-b82b-ec0df52f2a43)


## Features

- **AI Chat Assistant**  
  Engage in natural-language conversations powered by Google Gemini for Q&A, brainstorming, coding assistance, and more.  
- **Document Analysis**  
  Upload PDFs, images, or text files to generate summaries, extract keywords, and produce structured data.  
- **Image Insights**  
  Analyze images using vision models to detect objects, generate captions, and perform OCR.  
- **Custom Workflows**  
  Create and save multi-step AI pipelines (e.g., summarize → translate → format).  
- **History & Exports**  
  Review past sessions, export chat transcripts, and download analysis reports.

## Tech Stack

- **Backend**  
  - Spring Boot  
  - Spring AI  
  - Google Gemini API   
- **Frontend**  
  - React  
  - Vite  
  - Tailwind CSS and custom CSS)

## Prerequisites

- Java 17 or higher  
- Maven  
- A Google Cloud project with the Gemini API enabled  
- A valid `GOOGLE_GEMINI_API_KEY`

## Installation

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/NeerajKumar805/Smart-AI-Suite.git
   cd Smart-AI-Suite
   ```

2. **Configure Environment**  
   - Copy `backend/.env.example` to `backend/.env`.  
   - Add your Google Gemini API key:  
     ```plaintext
     GOOGLE_GEMINI_API_KEY=your_gemini_api_key_here
     ```

3. **Set Up the Backend**  
   ```bash
   cd backend
   mvn clean install
   mvn spring-boot:run
   ```
   The API will be available at `http://localhost:8080/api`.

4. **Set Up the Frontend**  
   ```bash
   cd ../frontend
   npm install
   npm run dev
   ```
   The application will launch at `http://localhost:5173`.

## Configuration

- **Database**  
  Update `backend/src/main/resources/application.properties` to configure your database connection.  
- **API Key**  
  Ensure the `GOOGLE_GEMINI_API_KEY` is set in `backend/.env` before starting the backend.

## Usage

1. Open your browser and navigate to `http://localhost:5173`.  
2. Authenticate or use a guest session.  
3. Use the sidebar to access **Chat**, **Documents**, **Images**, or **Workflows**.  
4. Upload files, enter prompts, and explore AI-powered insights.

## Screenshots

![ss8](https://github.com/user-attachments/assets/8f8c3d04-dc82-45ba-bec8-6c83e7b25f13)
![ss7](https://github.com/user-attachments/assets/55da1e2c-8fde-4f96-8a17-2d9faa0b1829)
![ss6](https://github.com/user-attachments/assets/963b14e9-603e-49e8-ba9c-73ffe12ea244)
![ss5](https://github.com/user-attachments/assets/bdbf08e9-6cef-483c-9578-4fcd0ea601fb)
![ss4](https://github.com/user-attachments/assets/8388db85-1324-4f76-95cb-bcfa743e85d1)
![ss3](https://github.com/user-attachments/assets/751dea7c-0034-4c2f-be10-4464fbd7981f)


## Contributing

Contributions and feedback are welcome! To contribute:

1. Fork the repository.  
2. Create a feature branch: `git checkout -b feature/YourFeature`.  
3. Commit your changes: `git commit -m 'Add YourFeature'`.  
4. Push to your branch: `git push origin feature/YourFeature`.  
5. Open a Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.

---

*Built with ❤️ by Neeraj*
```
