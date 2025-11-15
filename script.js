
document.addEventListener('DOMContentLoaded', () => {
  const yearEl = document.getElementById('year');
  if (yearEl) yearEl.textContent = new Date().getFullYear();

  const cantidad = document.getElementById('cantidad');
  const precioValor = document.getElementById('precioValor');

  function formatear(num) {
    if (!num && num !== 0) return '';
    return Number(num).toLocaleString('es-CO', { style: 'currency', currency: 'COP' });
  }

  if (cantidad && precioValor) {
    precioValor.textContent = formatear(parseInt(cantidad.value, 10));

    cantidad.addEventListener('change', () => {
      precioValor.textContent = formatear(parseInt(cantidad.value, 10));
    });
  }

  window.scrollComprar = () => {
    const comprar = document.getElementById('comprar');
    if (comprar) comprar.scrollIntoView({ behavior: 'smooth' });
  };

  const btnComprar = document.getElementById('btnComprar');
  if (btnComprar && cantidad) {
    btnComprar.addEventListener('click', () => {
      const tel = '573134971077'; // número (ajusta si lo necesitas)
      const precio = formatear(parseInt(cantidad.value, 10));
      const msg = `Hola, quiero comprar Café Aurora. Presentación: ${precio}`;
      window.open(`https://wa.me/${tel}?text=${encodeURIComponent(msg)}`, '_blank');
    });
  }
});
