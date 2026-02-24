import { useState } from "react";

export default function App() {
  const [price, setPrice] = useState<number>(10);
  const [qty, setQty] = useState<number>(2);

  function calcTotal() {
    debugger;
    const total = price + qty;
    console.log("Cheguei no calcTotal", { price, qty });
    return total;
  }

    return (
      <div style={{ padding: 24 }}>
        <h1>Debug no React + Vite + TS</h1>

        <p>Preço (number): {price}</p>
        <p>Quantidade (number): {qty}</p>

        <button onClick={() => console.log("Total", calcTotal())}>
        Calcular total  
        </button> 
      </div>
    );
  
}