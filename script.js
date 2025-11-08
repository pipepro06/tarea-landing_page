
document.addEventListener('DOMContentLoaded', () => {
  document.getElementById('year').textContent = new Date().getFullYear();

  const cantidad = document.getElementById('cantidad');
  const precioValor = document.getElementById('precioValor');

  function formatear(num){
    return num.toLocaleString('es-CO',{style:'currency',currency:'COP'});
  }

  cantidad.addEventListener('change',()=>{
    precioValor.textContent = formatear(parseInt(cantidad.value));
  });

  window.scrollComprar = () => {
    document.getElementById('comprar').scrollIntoView({behavior:'smooth'});
  };

  document.getElementById('btnComprar').addEventListener('click',()=>{
    const tel = '573134971077';
    const precio = formatear(parseInt(cantidad.value));
    const msg = `Hola, quiero comprar Café Aurora. Presentación: ${precio}`;
    window.open(`https://wa.me/${tel}?text=${encodeURIComponent(msg)}`,'_blank');
  });
});
