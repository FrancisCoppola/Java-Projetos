<div class="flex max-w-full flex-col grow">
   <div data-message-author-role="assistant" data-message-id="bf944929-b83c-4cf8-99f0-349c0e66c2f4" dir="auto" class="min-h-8 text-message relative flex w-full flex-col items-end gap-2 text-start break-words whitespace-normal [.text-message+&amp;]:mt-5" data-message-model-slug="gpt-5">
      <div class="flex w-full flex-col gap-1 empty:hidden first:pt-[3px]">
         <div class="markdown prose dark:prose-invert w-full break-words dark markdown-new-styling">
            <p data-start="0" data-end="159">🚀 Agora sim vamos deixar a coisa com cara de <strong data-start="60" data-end="82">sistema de verdade</strong>:<br data-start="83" data-end="86">
               um <strong data-start="89" data-end="133">cadastro de clientes com menu no console</strong> usando <strong data-start="141" data-end="156"><code data-start="143" data-end="154">ArrayList</code></strong>.
            </p>
            <p data-start="161" data-end="308">Isso já vai te dar a noção de como funciona um <strong data-start="208" data-end="216">CRUD</strong> (Create, Read, Update, Delete), que é a base de qualquer sistema (ERP, CRM, Imóveis, etc.).</p>
            <hr data-start="310" data-end="313">
            <h2 data-start="315" data-end="362">📖 Exemplo – Cadastro com <code data-start="344" data-end="355">ArrayList</code> e Menu</h2>
            <p data-start="364" data-end="394">Crie o arquivo <code data-start="379" data-end="393">Cliente.java</code>:</p>
            <pre class="overflow-visible!" data-start="396" data-end="519"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between h-9 bg-token-sidebar-surface-primary select-none rounded-t-2xl">java</div><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">class</span></span><span> </span><span><span class="hljs-title class_">Cliente</span></span><span> {
    String nome;
    </span><span><span class="hljs-type">int</span></span><span> idade;
    String cpf;
    </span><span><span class="hljs-type">double</span></span><span> salario;
    </span><span><span class="hljs-type">boolean</span></span><span> ativo;
}
</span></span></code></div></div></pre>
            <p data-start="521" data-end="561">Agora, o arquivo <code data-start="538" data-end="560">CadastroCliente.java</code>:</p>
            <pre class="overflow-visible!" data-start="563" data-end="3213"><div class="contain-inline-size rounded-2xl relative bg-token-sidebar-surface-primary"><div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between h-9 bg-token-sidebar-surface-primary select-none rounded-t-2xl">java</div><div class="sticky top-9"><div class="absolute end-0 bottom-0 flex h-9 items-center pe-2"><div class="bg-token-bg-elevated-secondary text-token-text-secondary flex items-center gap-4 rounded-sm px-2 font-sans text-xs"></div></div></div><div class="overflow-y-auto p-4" dir="ltr"><code class="whitespace-pre! language-java"><span><span><span class="hljs-keyword">import</span></span><span> java.util.ArrayList;
</span><span><span class="hljs-keyword">import</span></span><span> java.util.Scanner;

</span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">class</span></span><span> </span><span><span class="hljs-title class_">CadastroCliente</span></span><span> {
    </span><span><span class="hljs-keyword">public</span></span><span> </span><span><span class="hljs-keyword">static</span></span><span> </span><span><span class="hljs-keyword">void</span></span><span> </span><span><span class="hljs-title function_">main</span></span><span><span class="hljs-params">(String[] args)</span></span><span> {
        </span><span><span class="hljs-type">Scanner</span></span><span> </span><span><span class="hljs-variable">sc</span></span><span> </span><span><span class="hljs-operator">=</span></span><span> </span><span><span class="hljs-keyword">new</span></span><span> </span><span><span class="hljs-title class_">Scanner</span></span><span>(System.in);
        ArrayList&lt;Cliente&gt; clientes = </span><span><span class="hljs-keyword">new</span></span><span> </span><span><span class="hljs-title class_">ArrayList</span></span><span>&lt;&gt;();
        </span><span><span class="hljs-type">int</span></span><span> opcao;
        </span><span><span class="hljs-keyword">do</span></span><span> {
            System.out.println(</span><span><span class="hljs-string">"===== MENU ====="</span></span><span>);
            System.out.println(</span><span><span class="hljs-string">"1 - Cadastrar cliente"</span></span><span>);
            System.out.println(</span><span><span class="hljs-string">"2 - Listar clientes"</span></span><span>);
            System.out.println(</span><span><span class="hljs-string">"0 - Sair"</span></span><span>);
            System.out.print(</span><span><span class="hljs-string">"Escolha uma opção: "</span></span><span>);
            opcao = sc.nextInt();
            sc.nextLine(); </span><span><span class="hljs-comment">// consumir quebra de linha</span></span><span>
            </span><span><span class="hljs-keyword">switch</span></span><span> (opcao) {
                </span><span><span class="hljs-keyword">case</span></span><span> </span><span><span class="hljs-number">1</span></span><span>:
                    </span><span><span class="hljs-type">Cliente</span></span><span> </span><span><span class="hljs-variable">c</span></span><span> </span><span><span class="hljs-operator">=</span></span><span> </span><span><span class="hljs-keyword">new</span></span><span> </span><span><span class="hljs-title class_">Cliente</span></span><span>();
                    System.out.print(</span><span><span class="hljs-string">"Nome: "</span></span><span>);
                    c.nome = sc.nextLine();
                    System.out.print(</span><span><span class="hljs-string">"Idade: "</span></span><span>);
                    c.idade = sc.nextInt();
                    sc.nextLine(); </span><span><span class="hljs-comment">// consumir quebra de linha</span></span><span>
                    System.out.print(</span><span><span class="hljs-string">"CPF: "</span></span><span>);
                    c.cpf = sc.nextLine();
                    System.out.print(</span><span><span class="hljs-string">"Salário: "</span></span><span>);
                    c.salario = sc.nextDouble();
                    System.out.print(</span><span><span class="hljs-string">"Ativo (true/false): "</span></span><span>);
                    c.ativo = sc.nextBoolean();
                    clientes.add(c);
                    System.out.println(</span><span><span class="hljs-string">"✅ Cliente cadastrado com sucesso!\n"</span></span><span>);
                    </span><span><span class="hljs-keyword">break</span></span><span>;
                </span><span><span class="hljs-keyword">case</span></span><span> </span><span><span class="hljs-number">2</span></span><span>:
                    System.out.println(</span><span><span class="hljs-string">"===== Lista de Clientes ====="</span></span><span>);
                    </span><span><span class="hljs-keyword">if</span></span><span> (clientes.isEmpty()) {
                        System.out.println(</span><span><span class="hljs-string">"Nenhum cliente cadastrado.\n"</span></span><span>);
                    } </span><span><span class="hljs-keyword">else</span></span><span> {
                        </span><span><span class="hljs-keyword">for</span></span><span> (</span><span><span class="hljs-type">int</span></span><span> </span><span><span class="hljs-variable">i</span></span><span> </span><span><span class="hljs-operator">=</span></span><span> </span><span><span class="hljs-number">0</span></span><span>; i &lt; clientes.size(); i++) {
                            </span><span><span class="hljs-type">Cliente</span></span><span> </span><span><span class="hljs-variable">cli</span></span><span> </span><span><span class="hljs-operator">=</span></span><span> clientes.get(i);
                            System.out.println(</span><span><span class="hljs-string">"Cliente "</span></span><span> + (i + </span><span><span class="hljs-number">1</span></span><span>));
                            System.out.println(</span><span><span class="hljs-string">"Nome: "</span></span><span> + cli.nome);
                            System.out.println(</span><span><span class="hljs-string">"Idade: "</span></span><span> + cli.idade + </span><span><span class="hljs-string">" anos"</span></span><span>);
                            System.out.println(</span><span><span class="hljs-string">"CPF: "</span></span><span> + cli.cpf);
                            System.out.println(</span><span><span class="hljs-string">"Salário: R$ "</span></span><span> + cli.salario);
                            System.out.println(</span><span><span class="hljs-string">"Ativo? "</span></span><span> + cli.ativo);
                            System.out.println(</span><span><span class="hljs-string">"-------------------------"</span></span><span>);
                        }
                    }
                    </span><span><span class="hljs-keyword">break</span></span><span>;
                </span><span><span class="hljs-keyword">case</span></span><span> </span><span><span class="hljs-number">0</span></span><span>:
                    System.out.println(</span><span><span class="hljs-string">"Saindo..."</span></span><span>);
                    </span><span><span class="hljs-keyword">break</span></span><span>;
                </span><span><span class="hljs-keyword">default</span></span><span>:
                    System.out.println(</span><span><span class="hljs-string">"❌ Opção inválida!\n"</span></span><span>);
            }
        } </span><span><span class="hljs-keyword">while</span></span><span> (opcao != </span><span><span class="hljs-number">0</span></span><span>);
        sc.close();
    }
}
</span></span></code></div></div></pre>
            <hr data-start="3215" data-end="3218">
            <h2 data-start="3220" data-end="3248">🔎 O que esse código faz:</h2>
            <ul data-start="3249" data-end="3546">
               <li data-start="3249" data-end="3319">
                  <p data-start="3251" data-end="3319">Usa um <strong data-start="3258" data-end="3273"><code data-start="3260" data-end="3271">ArrayList</code></strong> para guardar todos os clientes cadastrados.</p>
               </li>
               <li data-start="3320" data-end="3405">
                  <p data-start="3322" data-end="3405">Tem um <strong data-start="3329" data-end="3347">menu de opções</strong> no console (<code data-start="3360" data-end="3375">1 - Cadastrar</code>, <code data-start="3377" data-end="3389">2 - Listar</code>, <code data-start="3391" data-end="3401">0 - Sair</code>).</p>
               </li>
               <li data-start="3406" data-end="3468">
                  <p data-start="3408" data-end="3468">Usa o <strong data-start="3414" data-end="3427"><code data-start="3416" data-end="3425">Scanner</code></strong> para ler dados digitados pelo usuário.</p>
               </li>
               <li data-start="3469" data-end="3546">
                  <p data-start="3471" data-end="3546">Evita perder dados enquanto o programa roda (lista cresce dinamicamente).</p>
               </li>
            </ul>
         </div>
      </div>
   </div>
</div>