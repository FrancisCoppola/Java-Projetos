<div class="flex max-w-full flex-col grow">
   <div data-message-author-role="assistant" data-message-id="53449537-aa50-49bd-b02d-ff4b48c1a44f" dir="auto" class="min-h-8 text-message relative flex w-full flex-col items-end gap-2 text-start break-words whitespace-normal [.text-message+&amp;]:mt-5" data-message-model-slug="gpt-5">
      <div class="flex w-full flex-col gap-1 empty:hidden first:pt-[3px]">
         <div class="markdown prose dark:prose-invert w-full break-words dark markdown-new-styling">
            <p data-start="0" data-end="136">
               🎉 Agora sim você já está <strong data-start="48" data-end="79">manipulando dados em listas</strong> e usando <strong data-start="89" data-end="106">laços (<code data-start="98" data-end="103">for</code>)</strong> — isso é um passo enorme 👏
            </p>
            <p data-start="138" data-end="165">Com isso, você já entendeu:</p>
            <ul data-start="167" data-end="307">
               <li data-start="167" data-end="196">
                  <p data-start="169" data-end="196">✅ Como declarar variáveis</p>
               </li>
               <li data-start="197" data-end="245">
                  <p data-start="199" data-end="245">✅ Como guardar vários valores com <strong data-start="233" data-end="243">arrays</strong></p>
               </li>
               <li data-start="246" data-end="307">
                  <p data-start="248" data-end="307">✅ Como percorrer e exibir tudo com um <strong data-start="286" data-end="307">laço de repetição</strong></p>
               </li>
            </ul>
            <hr data-start="309" data-end="312">
            <h2 data-start="314" data-end="360">🚀 Próximo passo: Orientação a Objetos (OO)</h2>
            <p data-start="361" data-end="477">Chegou a hora de dar o salto para o <strong data-start="397" data-end="440">jeito profissional de programar em Java</strong>, que é usando <strong data-start="455" data-end="476">classes e objetos</strong>.</p>
            <p data-start="479" data-end="497">A ideia é simples:</p>
            <ul data-start="499" data-end="641">
               <li data-start="499" data-end="566">
                  <p data-start="501" data-end="566">Uma <strong data-start="505" data-end="515">classe</strong> descreve como é um tipo de objeto (ex: <code data-start="555" data-end="564">Cliente</code>).</p>
               </li>
               <li data-start="567" data-end="641">
                  <p data-start="569" data-end="641">Um <strong data-start="572" data-end="582">objeto</strong> é uma instância dessa classe (ex: <code data-start="617" data-end="627">cliente1</code>, <code data-start="629" data-end="639">cliente2</code>).</p>
               </li>
            </ul>
            <hr data-start="643" data-end="646">
            <h2 data-start="648" data-end="688">📖 Exemplo prático – Classe <code data-start="679" data-end="688">Cliente</code></h2>
            <p data-start="689" data-end="720">Crie um arquivo <code data-start="705" data-end="719">Cliente.java</code>:</p>
            <pre class="overflow-visible!" data-start="722" data-end="845"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between h-9 bg-token-sidebar-surface-primary select-none rounded-t-2xl">java</div><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">class</span></span><span> </span><span><span class="hljs-title class_">Cliente</span></span><span> {
    String nome;
    </span><span><span class="hljs-type">int</span></span><span> idade;
    String cpf;
    </span><span><span class="hljs-type">double</span></span><span> salario;
    </span><span><span class="hljs-type">boolean</span></span><span> ativo;
}
</span></span></code></div></div></pre>
            <p data-start="847" data-end="893">Depois, crie o arquivo <code data-start="870" data-end="892">CadastroCliente.java</code>:</p>
            <pre class="overflow-visible!" data-start="895" data-end="1945"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between h-9 bg-token-sidebar-surface-primary select-none rounded-t-2xl">java</div><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">class</span></span><span> </span><span><span class="hljs-title class_">CadastroCliente</span></span><span> {
    </span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">static</span></span><span> </span><span><span class="hljs-keyword">void</span></span><span> </span><span><span class="hljs-title function_">main</span></span><span><span class="hljs-params">(String[] args)</span></span><span> {
        </span><span><span class="hljs-comment">// Criando objetos do tipo Cliente</span></span><span>
        </span><span><span class="hljs-type">Cliente</span></span><span> </span><span><span class="hljs-variable">c1</span></span><span> </span><span><span class="hljs-operator">=</span></span><span> </span><span><span class="hljs-keyword">new</span></span><span> </span><span><span class="hljs-title class_">Cliente</span></span><span>();
        c1.nome = </span><span><span class="hljs-string">"Francis Chileno"</span></span><span>;
        c1.idade = </span><span><span class="hljs-number">32</span></span><span>;
        c1.cpf = </span><span><span class="hljs-string">"123.456.789-00"</span></span><span>;
        c1.salario = </span><span><span class="hljs-number">3000.00</span></span><span>;
        c1.ativo = </span><span><span class="hljs-literal">true</span></span><span>;
        </span><span><span class="hljs-type">Cliente</span></span><span> </span><span><span class="hljs-variable">c2</span></span><span> </span><span><span class="hljs-operator">=</span></span><span> </span><span><span class="hljs-keyword">new</span></span><span> </span><span><span class="hljs-title class_">Cliente</span></span><span>();
        c2.nome = </span><span><span class="hljs-string">"Francis Coppola"</span></span><span>;
        c2.idade = </span><span><span class="hljs-number">35</span></span><span>;
        c2.cpf = </span><span><span class="hljs-string">"987.654.321-00"</span></span><span>;
        c2.salario = </span><span><span class="hljs-number">6000.00</span></span><span>;
        c2.ativo = </span><span><span class="hljs-literal">false</span></span><span>;
        </span><span><span class="hljs-comment">// Exibindo os clientes</span></span><span>
        exibirCliente(c1);
        exibirCliente(c2);
    }
    </span><span><span class="hljs-comment">// Método para exibir um cliente</span></span><span>
    </span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">static</span></span><span> </span><span><span class="hljs-keyword">void</span></span><span> </span><span><span class="hljs-title function_">exibirCliente</span></span><span><span class="hljs-params">(Cliente c)</span></span><span> {
        System.out.println(</span><span><span class="hljs-string">"===== Cadastro de Cliente ====="</span></span><span>);
        System.out.println(</span><span><span class="hljs-string">"Nome: "</span></span><span> + c.nome);
        System.out.println(</span><span><span class="hljs-string">"Idade: "</span></span><span> + c.idade + </span><span><span class="hljs-string">" anos"</span></span><span>);
        System.out.println(</span><span><span class="hljs-string">"CPF: "</span></span><span> + c.cpf);
        System.out.println(</span><span><span class="hljs-string">"Salário: R$ "</span></span><span> + c.salario);
        System.out.println(</span><span><span class="hljs-string">"Cliente ativo? "</span></span><span> + c.ativo);
        System.out.println();
    }
}
</span></span></code></div></div></pre>
            <p data-start="1947" data-end="1967">📌 O que mudou aqui:</p>
            <ul data-start="1968" data-end="2149">
               <li data-start="1968" data-end="2023">
                  <p data-start="1970" data-end="2023">Cada cliente agora é um <strong data-start="1994" data-end="2004">objeto</strong> (<code data-start="2006" data-end="2021">new Cliente()</code>).</p>
               </li>
               <li data-start="2024" data-end="2074">
                  <p data-start="2026" data-end="2074">Os dados ficam <strong data-start="2041" data-end="2073">organizados dentro do objeto</strong>.</p>
               </li>
               <li data-start="2075" data-end="2149">
                  <p data-start="2077" data-end="2149">Criamos um <strong data-start="2088" data-end="2098">método</strong> <code data-start="2099" data-end="2116">exibirCliente()</code> para evitar repetição de código.</p>
               </li>
            </ul>
            <hr data-start="2151" data-end="2154">
            <p data-start="2156" data-end="2211">Se esse rodar certinho no teu VS Code, aí a gente pode:</p>
            <ul data-start="2212" data-end="2361">
               <li data-start="2212" data-end="2261">
                  <p data-start="2214" data-end="2261">adicionar <strong data-start="2224" data-end="2258">listas de clientes (ArrayList)</strong>,</p>
               </li>
               <li data-start="2262" data-end="2303">
                  <p data-start="2264" data-end="2303">criar um <strong data-start="2273" data-end="2300">menu simples no console</strong>,</p>
               </li>
               <li data-start="2304" data-end="2361">
                  <p data-start="2306" data-end="2361">e depois ir para <strong data-start="2323" data-end="2360">salvar os dados no banco de dados</strong>.</p>
               </li>
            </ul>
         </div>
      </div>
   </div>
</div>