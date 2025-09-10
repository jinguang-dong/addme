package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class icm implements syf {
    final /* synthetic */ int a;
    final /* synthetic */ ico b;
    final /* synthetic */ lgn c;
    final /* synthetic */ lss d;
    final /* synthetic */ UUID e;
    final /* synthetic */ rwc f;
    final /* synthetic */ szh g;
    final /* synthetic */ icp h;

    public icm(icp icpVar, int i, ico icoVar, lgn lgnVar, lss lssVar, UUID uuid, rwc rwcVar, szh szhVar) {
        this.a = i;
        this.b = icoVar;
        this.c = lgnVar;
        this.d = lssVar;
        this.e = uuid;
        this.f = rwcVar;
        this.g = szhVar;
        this.h = icpVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        ((sgt) ((sgt) icp.a.b().i(th)).M((char) 1831)).s("Error encoding jpeg image.");
        this.g.a(th);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.NavigableMap] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, jnz] */
    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        syu syuVarM;
        kjd kjdVar = (kjd) obj;
        try {
            icp icpVar = this.h;
            kjdVar.getClass();
            int i = this.a;
            ico icoVar = this.b;
            lgn lgnVar = this.c;
            lss lssVar = this.d;
            UUID uuid = this.e;
            rwc rwcVar = this.f;
            ocq ocqVar = icpVar.f;
            ExifInterface exifInterface = kjdVar.c;
            ocqVar.q(exifInterface);
            ltf ltfVarM = lssVar.m();
            hbj hbjVar = icpVar.e;
            byte[] bArr = kjdVar.b;
            pas pasVar = kjdVar.d;
            int i2 = pasVar.b;
            int i3 = pasVar.a;
            long j = kjdVar.a;
            lri lriVar = new lri(i, j, uuid, i3, i2, bArr, exifInterface, lgnVar, ltfVarM, hbjVar);
            rwc rwcVarA = icpVar.c.a(lssVar.h().b);
            int i4 = lssVar.l().a;
            rwc rwcVarB = lssVar.p().b(new fhy(20));
            ggg gggVar = icpVar.g;
            gggVar.a.put(Long.valueOf(j), Float.valueOf(i));
            if (icoVar != ico.PRIMARY) {
                int iOrdinal = icoVar.ordinal();
                String str = "";
                if (iOrdinal == 0) {
                    str = "ORIGINAL";
                } else if (iOrdinal == 2) {
                    str = "SECONDARY";
                } else if (iOrdinal == 3) {
                    str = "DEBUG";
                }
                lsu lsuVarB = lssVar.k().b("jpg");
                lsuVarB.b.h(str);
                lsuVarB.c(hqp.NONE);
                rvk rvkVar = rvk.a;
                syuVarM = ske.M(lriVar.a(lsuVarB, rvkVar, rvkVar));
            } else if (rwcVar.h()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                lsu lsuVarJ = lssVar.j();
                mfo mfoVar = new mfo(ppo.c);
                try {
                    lriVar.b(rwcVarA, rwcVarB, lsuVarJ.d, lsuVarJ.c.e(), byteArrayOutputStream);
                    syuVarM = rwcVar.c().b(mfoVar, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), lssVar.j(), rvk.a, lssVar.f(), lssVar.w(), lssVar.o());
                } catch (IOException e) {
                    lsuVarJ.a();
                    throw new IllegalStateException(e);
                }
            } else {
                syuVarM = ske.M(lriVar.a(lssVar.j(), rwcVarA, rwcVarB));
            }
            this.g.f(swz.i(syuVarM, new fym(kjdVar, 5), sxo.a));
        } catch (RuntimeException e2) {
            ((sgt) ((sgt) icp.a.b().i(e2)).M((char) 1834)).v("Error attaching jpeg image to the session %s", this.d.w());
            this.g.a(e2);
        }
    }
}
