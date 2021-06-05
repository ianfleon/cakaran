<?php

class Orang {

	private var string $nama = "Ian";

	public function __construct()
	{
		echo "Hai, nama saya: " . $this->nama;
	}

	public function getNama(): string
	{
		return $this->nama;
	}

}

$orang = new Orang;