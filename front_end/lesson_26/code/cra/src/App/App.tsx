import React from 'react';
import { Routes, Route } from 'react-router-dom';
import './App.css';
import GenderReveal from '../GenderReveal/GenderReveal';
import Counter from '../Counter/Counter';
import Layout from '../Layout/Layout';
import Home from '../Home/Home';
import Cinema from '../Cinema/Cinema';
import ShoeShop from '../ShoeShop/ShoeShop';
import BootstrapPage from '../BootstrapPage/BootstrapPage';

function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route path="/gender" element={<GenderReveal />} />
        <Route path="/counter" element={<Counter />} />
        <Route path="/cinema" element={<Cinema />} />
        <Route path="/shoeshop" element={<ShoeShop />} />
        <Route path="/" element={<Home />} />
        <Route path="/bootstrap" element={<BootstrapPage />} />
      </Route>
    </Routes>
  );
}

export default App;
