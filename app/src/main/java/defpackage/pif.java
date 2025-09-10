package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pif implements paq {
    private static int k;
    public final poo a;
    public final int b;
    public final Executor c;
    public final pbc e;
    public final pbr f;
    public final mwq j;
    private final our l;
    private final pas m;
    private final peg n;
    private final pbn p;
    private final pia q;
    private final String s;
    private final pjr t;
    private List v;
    private poj w;
    public boolean i = false;
    private boolean u = true;
    private final AtomicLong x = new AtomicLong(-1);
    private final Map y = new HashMap();
    public final Deque g = new ArrayDeque();
    public final Queue h = new sfx(new ArrayDeque());
    private final Runnable o = new pgr(this, 3, null);
    public final Runnable d = new pgr(this, 4, null);
    private final long r = d();

    public pif(pjr pjrVar, poo pooVar, our ourVar, Executor executor, pbc pbcVar, pbn pbnVar, mwq mwqVar, peg pegVar, pia piaVar) {
        this.a = pooVar;
        this.b = pooVar.b();
        this.l = ourVar;
        this.c = executor;
        this.e = pbcVar;
        this.p = pbnVar;
        this.j = mwqVar;
        this.m = new pas(pooVar.d(), pooVar.a());
        this.n = pegVar;
        this.q = piaVar;
        this.f = pbnVar.b("PckImageCount_".concat(qpt.aE(pooVar)));
        this.s = "distribute_".concat(qpt.aE(pooVar));
        this.t = pjrVar;
    }

    private static synchronized int d() {
        int i;
        i = k;
        k = i + 1;
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pbr] */
    private final void e(pic picVar) {
        mwq mwqVar;
        Map map = this.y;
        synchronized (map) {
            mwqVar = (mwq) map.get(picVar);
            if (mwqVar == null) {
                mwqVar = new mwq(this.p.b(String.format("%s:failure=%s", this.s, picVar.g)));
                map.put(picVar, mwqVar);
            }
        }
        ?? r0 = mwqVar.a;
        AtomicInteger atomicInteger = (AtomicInteger) mwqVar.b;
        r0.c(atomicInteger.incrementAndGet());
        if (picVar.equals(pic.NULL_DISTRIBUTION)) {
            peg pegVar = this.n;
            atomicInteger.get();
            pegVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
    
        r10.i(new defpackage.per(r17.t, r16.k()));
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0206, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0208, code lost:
    
        r17.e.h("Distributing null to " + java.lang.String.valueOf(r10.d()) + " for frame " + r11.c + " at " + r12 + " because it is older than " + r5.toString());
        r10.i(null);
        e(defpackage.pic.NULL_DISTRIBUTION);
        r8 = r16;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0253, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0255, code lost:
    
        if (r9 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0257, code lost:
    
        r2 = r17.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0259, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025a, code lost:
    
        r3 = r2.values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0266, code lost:
    
        if (r3.hasNext() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0268, code lost:
    
        r4 = (defpackage.mwq) r3.next();
        ((java.util.concurrent.atomic.AtomicInteger) r4.b).set(0);
        r4.a.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027c, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0281, code lost:
    
        r16.l();
        r6.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0287, code lost:
    
        monitor-enter(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0289, code lost:
    
        r17.u = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028b, code lost:
    
        monitor-exit(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        r6 = r17.p;
        r6.f(r17.s);
        r8 = new defpackage.pkf(r5);
        r3 = r3.iterator();
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r3.hasNext() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r10 = (defpackage.pio) r3.next();
        r11 = r10.c();
        r11.getClass();
        r12 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
    
        if (r12 != r0.b) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ea, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f2, code lost:
    
        if (r11.c != r0.c) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02de A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:5:0x000c, B:7:0x0010, B:8:0x0015, B:10:0x0018, B:12:0x001c, B:13:0x0021, B:15:0x0024, B:17:0x0028, B:19:0x0039, B:21:0x004b, B:22:0x0089, B:23:0x008c, B:24:0x008f, B:26:0x0093, B:28:0x0096, B:30:0x009b, B:31:0x00a2, B:33:0x00a8, B:35:0x00b7, B:39:0x00c8, B:42:0x00e5, B:43:0x00ea, B:45:0x00ed, B:46:0x00f5, B:48:0x00fb, B:50:0x0107, B:56:0x0116, B:57:0x011b, B:59:0x0121, B:61:0x012d, B:63:0x0135, B:66:0x013f, B:67:0x0144, B:79:0x017b, B:68:0x014b, B:69:0x0150, B:71:0x0156, B:73:0x0162, B:76:0x016e, B:77:0x0173, B:80:0x017d, B:82:0x0181, B:85:0x0189, B:86:0x018d, B:88:0x0194, B:91:0x01b1, B:92:0x01bd, B:125:0x0291, B:126:0x0298, B:128:0x029e, B:130:0x02ad, B:134:0x02be, B:136:0x02d3, B:138:0x02e0, B:139:0x02e3, B:137:0x02de), top: B:148:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194 A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:5:0x000c, B:7:0x0010, B:8:0x0015, B:10:0x0018, B:12:0x001c, B:13:0x0021, B:15:0x0024, B:17:0x0028, B:19:0x0039, B:21:0x004b, B:22:0x0089, B:23:0x008c, B:24:0x008f, B:26:0x0093, B:28:0x0096, B:30:0x009b, B:31:0x00a2, B:33:0x00a8, B:35:0x00b7, B:39:0x00c8, B:42:0x00e5, B:43:0x00ea, B:45:0x00ed, B:46:0x00f5, B:48:0x00fb, B:50:0x0107, B:56:0x0116, B:57:0x011b, B:59:0x0121, B:61:0x012d, B:63:0x0135, B:66:0x013f, B:67:0x0144, B:79:0x017b, B:68:0x014b, B:69:0x0150, B:71:0x0156, B:73:0x0162, B:76:0x016e, B:77:0x0173, B:80:0x017d, B:82:0x0181, B:85:0x0189, B:86:0x018d, B:88:0x0194, B:91:0x01b1, B:92:0x01bd, B:125:0x0291, B:126:0x0298, B:128:0x029e, B:130:0x02ad, B:134:0x02be, B:136:0x02d3, B:138:0x02e0, B:139:0x02e3, B:137:0x02de), top: B:148:0x000c, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, pbr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pif.a(java.lang.String):void");
    }

    public final void b() {
        synchronized (this) {
            if (!this.i) {
                this.c.execute(this.o);
            }
        }
    }

    public final synchronized void c(final peo peoVar, final long j) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            this.c.execute(new Runnable() { // from class: pib
                @Override // java.lang.Runnable
                public final void run() {
                    peo peoVar2;
                    long j2;
                    List list;
                    pdo pdoVarC;
                    pif pifVar = this.a;
                    synchronized (pifVar) {
                        Iterator it = pifVar.g.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            peoVar2 = peoVar;
                            j2 = j;
                            list = arrayList;
                            if (!zHasNext) {
                                break;
                            }
                            pio pioVar = (pio) it.next();
                            if (pioVar.d() == peoVar2 && (pdoVarC = pioVar.c()) != null && pdoVarC.c == j2) {
                                list.add(pioVar);
                                it.remove();
                            }
                        }
                    }
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((pio) it2.next()).i(null);
                        }
                        return;
                    }
                    pifVar.e.h("Received onBufferLost from " + String.valueOf(peoVar2) + " for frame " + j2 + " but was unable to find a matching request to abort.");
                }
            });
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        poj pojVar;
        ArrayList arrayList;
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            synchronized (this) {
                pojVar = this.w;
                arrayList = new ArrayList();
                List list = this.v;
                if (list != null) {
                    arrayList.addAll(list);
                }
                Deque deque = this.g;
                arrayList.addAll(deque);
                this.w = null;
                this.v = null;
                deque.clear();
            }
            if (pojVar != null) {
                pojVar.close();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pio) arrayList.get(i)).i(null);
            }
            this.l.close();
        }
    }

    public final String toString() {
        return qpt.aE(this.a) + "-" + this.r;
    }
}
