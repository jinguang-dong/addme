package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crw extends uht implements uiq {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crw(cru cruVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.d = i;
        this.c = cruVar;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        if (this.d != 0) {
            return new crw((cru) this.c, (uhb) obj, 1).b(ufg.a);
        }
        return new crw((crx) this.c, (uhb) obj, 0).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Exception {
        ?? r0;
        FileInputStream fileInputStream;
        ?? r2;
        Throwable th;
        FileInputStream fileInputStream2;
        Object obj2;
        csl csfVar;
        if (this.d != 0) {
            uhi uhiVar = uhi.a;
            int i = this.b;
            try {
            } catch (Throwable th2) {
                tdy tdyVarK = ((cru) this.c).k();
                this.a = th2;
                this.b = 2;
                Object objM = tdyVarK.m();
                if (objM == uhiVar) {
                    return uhiVar;
                }
                obj = objM;
                obj2 = th2;
            }
            if (i == 0) {
                rnt.aN(obj);
                Object obj3 = this.c;
                this.b = 1;
                obj = ((cru) obj3).f(true, this);
                if (obj == uhiVar) {
                    return uhiVar;
                }
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    rnt.aN(obj);
                    csfVar = new csf((Throwable) obj2, ((Number) obj).intValue());
                    return new uev(csfVar, true);
                }
                rnt.aN(obj);
            }
            csfVar = (csl) obj;
            return new uev(csfVar, true);
        }
        uhi uhiVar2 = uhi.a;
        int i2 = this.b;
        try {
            try {
            } catch (FileNotFoundException unused) {
                Object obj4 = this.c;
                File file = ((crx) obj4).a;
                if (!file.exists()) {
                    return ((crx) this.c).b.a;
                }
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    byz byzVar = ((crx) obj4).b;
                    this.a = fileInputStream3;
                    this.b = 2;
                    obj = byzVar.Z(fileInputStream3);
                    if (obj == uhiVar2) {
                        return uhiVar2;
                    }
                    fileInputStream = fileInputStream3;
                } catch (Throwable th3) {
                    th = th3;
                    r0 = fileInputStream3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    r0 = this.a;
                    try {
                        rnt.aN(obj);
                        fileInputStream = r0;
                        ujk.e(fileInputStream, null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                r2 = this.a;
                try {
                    rnt.aN(obj);
                    fileInputStream2 = r2;
                    ujk.e(fileInputStream2, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            rnt.aN(obj);
            Object obj5 = this.c;
            FileInputStream fileInputStream4 = new FileInputStream(((crx) obj5).a);
            try {
                byz byzVar2 = ((crx) obj5).b;
                this.a = fileInputStream4;
                this.b = 1;
                Object objZ = byzVar2.Z(fileInputStream4);
                if (objZ == uhiVar2) {
                    return uhiVar2;
                }
                fileInputStream2 = fileInputStream4;
                obj = objZ;
                ujk.e(fileInputStream2, null);
                return obj;
            } catch (Throwable th6) {
                r2 = fileInputStream4;
                th = th6;
                throw th;
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw cpo.b(((crx) this.c).a.getParent(), e);
            }
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crw(crx crxVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.d = i;
        this.c = crxVar;
    }
}
