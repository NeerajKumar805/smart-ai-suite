````markdown
# Smart‑AI‑Suite

Smart‑AI‑Suite is a modular AI platform that brings together powerful language, vision and data tools in one place. Built with a Spring Boot + Spring AI backend, powered by Google Gemini, and a lightning‑fast React + Vite frontend, it offers a seamless, responsive experience for web and mobile.

![Screenshot – Chat Interface](./snapshots/chat-interface.png)  
![Screenshot – Document Analysis](./snapshots/document-analysis.png)  
![Screenshot – Dashboard](./snapshots/dashboard.png)

## Features

- **AI Chat Assistant**  
  Natural‑language conversation powered by Google Gemini for Q&A, brainstorming, coding help, and more.  
- **Document Analysis**  
  Upload PDFs, images or text files—get summaries, keyword extraction and structured data.  
- **Image Insights**  
  Analyze and describe images with vision models; detect objects, generate captions, run OCR.  
- **Custom Workflows**  
  Create and save multi‑step AI pipelines (e.g., summarize → translate → format).  
- **History & Exports**  
  View past sessions, export chat transcripts and download analysis reports.  

## Tech Stack

- **Backend**  
  - Spring Boot  
  - Spring AI  
  - Google Gemini API  
  - MySQL (or your choice of relational DB)  
- **Frontend**  
  - React  
  - Vite  
  - Tailwind CSS (or plain CSS)  

## Prerequisites

- Java 17+  
- Maven  
- Node.js 16+ and npm/yarn  
- A Google Cloud project with the Gemini API enabled  
- A valid `GOOGLE_GEMINI_API_KEY`  

## Installation

1. **Clone the repo**  
   ```bash
   git clone https://github.com/YourUsername/Smart‑AI‑Suite.git
   cd Smart‑AI‑Suite

2. **Configure environment**

   * Copy `backend/.env.example` to `backend/.env`
   * Add your Google Gemini key:

     ```
     GOOGLE_GEMINI_API_KEY=your_gemini_api_key_here
     ```

3. **Backend setup**

   ```bash
   cd backend
   mvn clean install
   mvn spring-boot:run
   ```

   The API will start at `http://localhost:8080/api`.

4. **Frontend setup**

   ```bash
   cd ../frontend
   npm install
   npm run dev
   ```

   The app will launch at `http://localhost:5173`.

## Configuration

* **Database**
  Edit `backend/src/main/resources/application.properties` to point at your DB.
* **API Key**
  Ensure `GOOGLE_GEMINI_API_KEY` is set in `backend/.env` before starting.

## Usage

1. Open your browser at `http://localhost:5173`.
2. Authenticate or use a guest session.
3. Navigate through the sidebar: **Chat**, **Documents**, **Images**, **Workflows**.
4. Upload files, enter prompts and enjoy instant AI insights.

## Screenshots

<div style="display: flex; gap: 1rem; flex-wrap: wrap;">
  <img src="./snapshots/chat-interface.png" alt="Chat Interface" width="200" />
  <img src="./snapshots/document-analysis.png" alt="Document Analysis" width="200" />
  <img src="./snapshots/dashboard.png" alt="Dashboard" width="200" />
</div>

## Contributing

Contributions and feedback are welcome!

1. Fork the repo
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to your branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License. See [LICENSE](./LICENSE) for details.

---

*Built with ❤️ by Neeraj*

```

````
