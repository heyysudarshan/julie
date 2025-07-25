import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';
import path from 'path';

export default defineConfig({
    plugins: [react()],
    build: {
        lib: {
            entry: path.resolve(__dirname, 'src/index.js'),
            name: 'Julie React',
            fileName: 'julie-react',
            formats: ['es', 'cjs'],
        },
        rollupOptions: {
            external: ['react', 'react-dom'],
        },
    },
});