package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rrq implements rso {
    private final rso a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;

    public rrq(String str, rso rsoVar, rsn rsnVar) {
        this.d = str;
        this.a = rsoVar;
        this.b = rsoVar.f();
        this.c = rsoVar.d();
        Object obj = rsnVar.c;
        this.e = Thread.currentThread();
    }

    public static String fv(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.rso
    public final rso a() {
        return this.a;
    }

    @Override // defpackage.rso
    public final String c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, rso] */
    @Override // defpackage.rsp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        rsn rsnVarA = rsa.a();
        ?? r1 = rsnVarA.b;
        if (r1 == 0) {
            throw new rrx("Tried to end [" + c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == r1) {
            rsa.c(rsnVarA, r1.a());
            this.e = null;
            return;
        }
        throw new rry("Tried to end span " + c() + ", but that span is not the current span. The current span is " + r1.c() + ".");
    }

    @Override // defpackage.rso
    public final String d() {
        return this.c;
    }

    @Override // defpackage.rso
    public final Thread e() {
        return this.e;
    }

    @Override // defpackage.rso
    public final UUID f() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r15 = r1.c.d;
        r16 = r11;
        r11 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r15.containsKey(r11) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r1.c.d.put(r11, new defpackage.rsk(r6, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (r14 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        r14.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        if (r14 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        r14.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        r1.d = r6;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrq.toString():java.lang.String");
    }

    public rrq(String str, UUID uuid, String str2, rsn rsnVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        Object obj = rsnVar.c;
        this.e = Thread.currentThread();
    }
}
