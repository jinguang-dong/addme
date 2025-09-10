package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dql implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dql(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [blp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [dri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v75, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiq
    public final Object a(Object obj) throws Exception {
        int i = 9;
        switch (this.c) {
            case 0:
                return new dna(this.b, this.a, 2);
            case 1:
                btd.v((btd) obj, (bte) this.a, 0, 0, new dlz(this.b, i), 4);
                return ufg.a;
            case 2:
                btd.v((btd) obj, (bte) this.b, 0, 0, new dlz(this.a, 13), 4);
                return ufg.a;
            case 3:
                blm blmVar = (blm) obj;
                blmVar.v(this.b);
                ?? r6 = this.a;
                r6.a(blmVar);
                r6.b(blmVar);
                blmVar.p(true);
                return ufg.a;
            case 4:
                this.a.a((ebn) obj, this.b);
                return ufg.a;
            case 5:
                return chx.s((dsb) this.a, ((drj) this.b).a.c());
            case 6:
                return Long.valueOf(((dcb) ((got) this.a).a).c((ddo) obj, this.b));
            case 7:
                ((dcb) ((got) this.a).b).d((ddo) obj, this.b);
                return null;
            case 8:
                ((dbz) ((gox) this.a).c).c((ddo) obj, this.b);
                return null;
            case 9:
                ((dcb) ((gox) this.a).b).d((ddo) obj, this.b);
                return null;
            case 10:
                Object obj2 = this.a;
                gow gowVar = new gow((String) obj2);
                Object obj3 = this.b;
                dql dqlVar = new dql(obj3, gowVar, i);
                dco dcoVar = (dco) ((gox) obj3).a;
                dei.a(dcoVar, false, true, dqlVar);
                return (gow) dei.a(dcoVar, true, false, new dlz(obj2, 18));
            case 11:
                Object obj4 = this.a;
                gpa gpaVar = new gpa((gpf) obj4);
                Object obj5 = this.b;
                dql dqlVar2 = new dql(obj5, gpaVar, 12);
                dco dcoVar2 = ((gpe) obj5).a;
                ((Long) dei.a(dcoVar2, false, true, dqlVar2)).longValue();
                return (gpa) dei.a(dcoVar2, true, false, new dlz(obj4, 19));
            case 12:
                return Long.valueOf(((gpe) this.a).b.c((ddo) obj, this.b));
            case 13:
                ((hew) this.b).c.c((ddo) obj, this.a);
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((hew) this.b).b.d((ddo) obj, this.a);
                return null;
            case 15:
                ((hfc) this.b).b.d((ddo) obj, this.a);
                return null;
            case 16:
                return ((Resources) this.b).getString(R.string.iso_slider_desc, Integer.valueOf(((ljj) this.a).k(((Float) obj).floatValue())));
            case 17:
                return ((Resources) this.b).getString(R.string.shutter_slider_desc, qpt.bQ(((lkn) this.a).k(((Float) obj).floatValue())));
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                rwc rwcVar = ((ndw) this.a).n;
                ShutterButton shutterButton = ((ndh) this.b).a;
                shutterButton.j.l(rwcVar);
                shutterButton.j.f(iIntValue);
                return ufg.a;
            case 19:
                ((chq) obj).getClass();
                return new chy(ukj.x(((aus) this.b).j.a().floatValue()) << 32);
            default:
                cbn cbnVar = (cbn) obj;
                cbnVar.getClass();
                Object obj6 = this.b;
                cbw.d(cbnVar, (String) this.a.a(Float.valueOf(((gox) obj6).o())));
                cbnVar.e(cbm.h, new cbc(null, new ndd(obj6, i)));
                return ufg.a;
        }
    }

    public /* synthetic */ dql(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ dql(neb nebVar, aus ausVar, int i) {
        this.c = i;
        this.a = null;
        this.b = ausVar;
    }
}
