package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lse implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ lse(fqg fqgVar, mhq mhqVar, out outVar, mhp mhpVar, ovx ovxVar, int i) {
        this.f = i;
        this.a = fqgVar;
        this.b = mhqVar;
        this.d = outVar;
        this.c = mhpVar;
        this.e = ovxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, mzu] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, mzx] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, jnz] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, jnz] */
    @Override // java.lang.Runnable
    public final void run() throws pqo {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                ?? r1 = this.a;
                ?? r2 = this.c;
                ((mzy) this.b).p((nkw) this.d, this.e, r2, r1);
                return;
            }
            mhs mhsVar = new mhs();
            mhsVar.d("Milk");
            mhsVar.c(this.d);
            mhsVar.g((mhp) this.c);
            Object obj = this.e;
            mhsVar.f(new lgc(obj, 5));
            mhsVar.e(new lgc(obj, 6));
            ((fqg) this.a).b.d(this.b.d(mhsVar.a()));
            return;
        }
        Object obj2 = this.a;
        lsf lsfVar = (lsf) obj2;
        boolean zH = lsfVar.f.h();
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        if (!zH) {
            try {
                byte[] bArrP = ((lsf) obj2).P((byte[]) obj6);
                long jF = ((lrw) obj2).f();
                jlq jlqVarA = jly.a();
                jlqVarA.b(((lsf) obj2).g);
                jlqVarA.e(((mfo) obj3).f);
                jlqVarA.a = ((lsu) obj4).a.f;
                jlqVarA.d(true);
                jlqVarA.c(((mfo) obj3).g);
                long jF2 = prh.F(((lsf) obj2).c.b(((lsf) obj2).O(), jlz.a(bArrP, jF, jlqVarA.a()), ((lrw) obj2).p(), ((lrw) obj2).l()), (ExifInterface) ((rwc) obj5).f(), ((lsu) obj4).b);
                ((lsu) obj4).b();
                ((lrw) obj2).o().d(jF2);
                ((lrw) obj2).z().e(obj3);
                return;
            } catch (Throwable th) {
                lrw lrwVar = (lrw) obj2;
                ((sgt) ((sgt) lrw.a.b().i(th)).M(4353)).E("[%s] %s", lrwVar.l(), "Finish failed");
                lrwVar.b.B();
                lrwVar.z().a(th);
                return;
            }
        }
        lrw lrwVar2 = (lrw) obj2;
        long jF3 = lrwVar2.f();
        if (lrwVar2.m() == ltf.LONG_SHOT || lrwVar2.m() == ltf.AUTO_LONG_SHOT) {
            lsu lsuVar = (lsu) obj4;
            mfo mfoVar = (mfo) obj3;
            lrwVar2.z().f(lsfVar.f.c().a(mfoVar, lsuVar, (rwc) obj5, jF3, lrwVar2.o()));
        } else {
            byte[] bArrP2 = lsfVar.P((byte[]) obj6);
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArrP2);
            mfo mfoVar2 = (mfo) obj3;
            Optional optional = mfoVar2.g;
            tno tnoVar = tno.a;
            tnoVar.m();
            if (mfoVar2.g.isPresent()) {
                tnoVar.m().r((tph) mfoVar2.g.get());
            }
            if (lsfVar.h.h()) {
                long jF4 = lrwVar2.f();
                jlq jlqVarA2 = jly.a();
                jlqVarA2.b(lsfVar.g);
                jlqVarA2.e(mfoVar2.f);
                if (lsfVar.h.h()) {
                    throw null;
                }
                jlqVarA2.b = Optional.empty();
                if (lsfVar.h.h()) {
                    throw null;
                }
                jlqVarA2.a = Optional.empty();
                jlqVarA2.d(false);
                jlqVarA2.c(optional);
                byteArrayInputStream = jlz.a(bArrP2, jF4, jlqVarA2.a());
            }
            lsu lsuVar2 = (lsu) obj4;
            lrwVar2.z().f(lsfVar.f.c().b(mfoVar2, lsfVar.c.b(lsfVar.O(), byteArrayInputStream, lrwVar2.p(), lrwVar2.l()), lsuVar2, (rwc) obj5, jF3, lrwVar2.w(), lrwVar2.o()));
        }
        lsfVar.f = rvk.a;
    }

    public /* synthetic */ lse(lsf lsfVar, mfo mfoVar, lsu lsuVar, rwc rwcVar, byte[] bArr, int i) {
        this.f = i;
        this.a = lsfVar;
        this.b = mfoVar;
        this.c = lsuVar;
        this.d = rwcVar;
        this.e = bArr;
    }

    public /* synthetic */ lse(mzy mzyVar, nkw nkwVar, Runnable runnable, mzx mzxVar, mzu mzuVar, int i) {
        this.f = i;
        this.b = mzyVar;
        this.d = nkwVar;
        this.e = runnable;
        this.c = mzxVar;
        this.a = mzuVar;
    }
}
