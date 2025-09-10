package defpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class csd extends uht implements uiq {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ crx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csd(crx crxVar, Object obj, uhb uhbVar) {
        super(1, uhbVar);
        this.e = crxVar;
        this.d = obj;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new csd(this.e, this.d, (uhb) obj).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Exception {
        ?? r1;
        Throwable th;
        Object obj2;
        uhi uhiVar = uhi.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    rnt.aN(obj);
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ujk.e(r1, th);
                        throw th3;
                    }
                }
            } else {
                rnt.aN(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.e.a);
                Object obj3 = this.d;
                try {
                    csp cspVar = new csp(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    ((tqr) obj3).g(cspVar);
                    if (ufg.a == uhiVar) {
                        return uhiVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            ujk.e(r1, null);
            return ufg.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw cpo.b(this.e.a.getParent(), e);
            }
            throw e;
        }
    }
}
