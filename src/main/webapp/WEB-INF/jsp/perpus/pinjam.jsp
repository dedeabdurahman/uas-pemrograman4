<!DOCTYPE html>
<html lang="en">
<head>
<title>Perpustakaan</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"/>
</head>
<body>
<div class="container-fluid">
<div class="row">
<div class="col-md-3"></div>
 <div class="col-md-6">
<h2 align="center">Aplikasi Perpustakaan <small><small>Universitas Pancasila</small></small></h2>
</br>
<h3 align="center"> Form Pinjam Buku</h3>
</br>
<form action="#">
<table class="table table-striped">
<tr><td><select name="namaBuku" id="namaBuku">
		<option value='P4'>Pemrograman Java Servlet</option>
		<option value='RPL'>Rekayasa Perangkat Lunak</option>
		<option value='Jarkom'>Jaringan Komputer</option>
		</select></td></tr>
<tr><td>Jumlah Buku</td><td><input type="number" class="form-control" id="jumlah" name="jumlah" placeholder="jumlah"></td></tr>
<tr><td>Peminjam</td><td><input type="text" class="form-control" id="peminjam" name="peminjam" placeholder="Nama peminjam"></td></tr>
<tr><td>Tanggal Pinjam</td><td><input type="date" class="form-control" id="dari" name="dari"></td></tr>
<tr><td>Kembali</td><td><input type="date" class="form-control" id="sampai" name="sampai"></td></tr>
</table>
</br>
<button type="submit" class="btn btn-success">Pinjam</button>
      </form>
</div>
</div>	
</div>	
</body>
</html>
