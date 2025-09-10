package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class isg {
    public static final sgv a = sgv.g("isg");
    public final Executor b;
    public final hbj c;
    public final lat d;
    public final hbp e;

    public isg(Executor executor, hbp hbpVar, lat latVar, hbj hbjVar) {
        this.b = executor;
        this.e = hbpVar;
        this.d = latVar;
        this.c = hbjVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r6v8, types: [sgt, shi] */
    public final sbp a(pts ptsVar) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        Optional optionalEmpty3;
        Optional optionalEmpty4;
        rwr rwrVarB = rwr.b(':');
        int i = sbp.d;
        sbk sbkVar = new sbk();
        for (ptr ptrVar : ptsVar.h) {
            List listF = rwrVarB.f(ptrVar.c.toUpperCase(Locale.ROOT));
            ise iseVar = new ise(null);
            iseVar.b = Optional.empty();
            iseVar.c = Optional.empty();
            iseVar.d = Optional.empty();
            boolean zR = false;
            iseVar.a(false);
            isk[] iskVarArrValues = isk.values();
            int length = iskVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    optionalEmpty = Optional.empty();
                    break;
                }
                isk iskVar = iskVarArrValues[i2];
                if (listF.contains(iskVar.toString())) {
                    optionalEmpty = Optional.of(iskVar);
                    break;
                }
                i2++;
            }
            iseVar.a = optionalEmpty;
            isj[] isjVarArrValues = isj.values();
            int length2 = isjVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    optionalEmpty2 = Optional.empty();
                    break;
                }
                isj isjVar = isjVarArrValues[i3];
                if (listF.contains(isjVar.toString())) {
                    optionalEmpty2 = Optional.of(isjVar);
                    break;
                }
                i3++;
            }
            iseVar.b = optionalEmpty2;
            isi[] isiVarArrValues = isi.values();
            int length3 = isiVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    optionalEmpty3 = Optional.empty();
                    break;
                }
                isi isiVar = isiVarArrValues[i4];
                if (listF.contains(isiVar.toString())) {
                    optionalEmpty3 = Optional.of(isiVar);
                    break;
                }
                i4++;
            }
            iseVar.c = optionalEmpty3;
            Uri uri = Uri.parse(ptrVar.d);
            try {
                lat latVar = this.d;
                rdl rdlVar = new rdl();
                rdlVar.c();
                optionalEmpty4 = Optional.of(((File) latVar.m(uri, rdlVar)).getAbsolutePath());
            } catch (IOException e) {
                ((sgt) ((sgt) a.b().i(e)).M((char) 2263)).s("IOException while getting absolute path.");
                optionalEmpty4 = Optional.empty();
            }
            iseVar.d = optionalEmpty4;
            try {
                zR = this.d.r(Uri.parse(ptrVar.d));
            } catch (IOException e2) {
                ((sgt) ((sgt) a.b().i(e2)).M((char) 2262)).s("IOException while checking whether the file exist.");
            }
            iseVar.a(zR);
            if (iseVar.f != 1) {
                throw new IllegalStateException();
            }
            sbkVar.h(new isf(iseVar.a, iseVar.b, iseVar.c, iseVar.d, iseVar.e));
        }
        return sbkVar.g();
    }

    public final syu b() {
        if (this.c.p(gza.h)) {
            return swz.i(this.e.q(), new fym(this, 11), this.b);
        }
        int i = sbp.d;
        return ske.M(sex.a);
    }
}
