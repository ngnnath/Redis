---


---

<h2 id="redis">Redis</h2>
<p>Base de donnée clé valeur très facime à mettre en place pour des tests.</p>
<h3 id="installation-de-redis-server">Installation de Redis Server</h3>
<pre><code>sudo apt install redis-server`
</code></pre>
<p>Etat du serveur redis:</p>
<pre><code>sudo systemctl status redis-server
</code></pre>
<p>Fichier de configuration:</p>
<pre><code>sudo nano /etc/redis/redis.conf
</code></pre>
<p>Lancer un shell client :</p>
<pre><code>redis-cli
</code></pre>
<p>Vérifier si le serveur est up :<br>
<code>ping</code>  et le serveur doit répondre <code>PONG</code></p>
<p>Commandes : <a href="https://redis.io/commands">https://redis.io/commands</a><br>
Example :</p>
<pre><code>set var1 toto
</code></pre>
<p>var1 est la key<br>
toto est la value</p>

