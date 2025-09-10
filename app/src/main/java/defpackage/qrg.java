package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrg {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public qrg(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (c()) {
            return this.b;
        }
        return 0;
    }

    public final File b() {
        if (this.e == null) {
            this.e = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        }
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    public final boolean c() throws IOException {
        FileInputStream fileInputStream;
        if (this.c) {
            return true;
        }
        try {
            fileInputStream = new FileInputStream(b());
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5730)).s("failed to read counter from disk.");
            return false;
        }
        try {
            tow towVarA = tow.a();
            qro qroVar = qro.a;
            ton tonVarK = ton.K(fileInputStream);
            tph tphVarO = qroVar.o();
            try {
                try {
                    try {
                        try {
                            trg trgVarB = tra.a.b(tphVarO);
                            trgVarB.l(tphVarO, too.p(tonVarK), towVarA);
                            trgVarB.g(tphVarO);
                            tph.D(tphVarO);
                            this.b = ((qro) tphVarO).c;
                            fileInputStream.close();
                            this.c = true;
                            return true;
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof tpz) {
                                throw ((tpz) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (IOException e3) {
                        if (e3.getCause() instanceof tpz) {
                            throw ((tpz) e3.getCause());
                        }
                        throw new tpz(e3);
                    }
                } catch (tpz e4) {
                    if (e4.a) {
                        throw new tpz(e4);
                    }
                    throw e4;
                }
            } catch (tro e5) {
                throw e5.a();
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
