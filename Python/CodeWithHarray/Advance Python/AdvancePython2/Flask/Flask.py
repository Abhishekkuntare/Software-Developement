from flask import Flask
app = Flask(__name__)


@app.route("/")
def hello_world():
    return ''' <h1>Hello world</h1>  <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlM492RB01vsdPwyUiP9p_6AtlrnwfEIt98g&usqp=CAU" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDHFyVMUib_ihj3n_FkCB-AqpiyPsSSP6T0-LTy6trP9hWltuZ3fCXf_LIqEtS_Jyct2U&usqp=CAU" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiG2dZPYaRbVWN3hdXKTgTzvqwteybypiiFjqHsIYo5r0C5WDhqj87dE0yiRR7aCCkIiw&usqp=CAU" class="d-block w-100" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>'''

if  __name__ =="__main__":
    app.run(debug=True)