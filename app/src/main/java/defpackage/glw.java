package defpackage;

import android.content.pm.ResolveInfo;
import android.view.Window;
import android.view.WindowManager;
import com.google.googlex.gcam.CyclopsParameters;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class glw implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ glw(ipk ipkVar, dtm dtmVar, Window window, int i) {
        this.d = i;
        this.b = ipkVar;
        this.c = dtmVar;
        this.a = window;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [iqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r10v4, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, owf] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        List list;
        List list2;
        byte b = 0;
        int i = 0;
        switch (this.d) {
            case 0:
                krj krjVar = (krj) obj;
                our ourVar = krjVar.L;
                glc glcVar = new glc(this.b, krjVar, 8, b == true ? 1 : 0);
                ?? r1 = this.a;
                sxo sxoVar = sxo.a;
                ourVar.d(r1.dK(glcVar, sxoVar));
                ourVar.d(this.c.dK(new gej(krjVar, 20), sxoVar));
                break;
            case 1:
                try {
                    ((fnh) obj).b(new fmg(this.b.d(), ((foy) this.c).c(((fon) this.a).f().dN())));
                    break;
                } catch (fnw | fnx | fnz | foa e) {
                    ((sgt) ((sgt) fkl.a.c().i(e)).M((char) 243)).s("Unable to create camera anchors.");
                    return;
                }
            case 2:
                ((ibl) obj).c((InterleavedImageU8) this.c, new PortraitRequest(0L, false), (ShotMetadata) this.b, ((ici) this.a).a().i, new our());
                break;
            case 3:
                ifm ifmVar = (ifm) this.a;
                CyclopsParameters cyclopsParameters = ifmVar.b;
                poe poeVar = ifmVar.a;
                ((ibl) obj).f((InterleavedImageU8) this.c, (ShotMetadata) this.b, sbp.l(poeVar), cyclopsParameters);
                break;
            case 4:
                boolean z = ((nbe) obj).j;
                ?? r0 = this.c;
                if (!z) {
                    r0.b();
                    break;
                } else {
                    r0.a(new ipd(this.a, this.b, i));
                    break;
                }
            case 5:
                Window window = (Window) this.a;
                ((dtm) this.c).b(((isb) obj).a(window.getWindowManager().getCurrentWindowMetrics().getBounds(), ((ipk) this.b).u.getAndSet(false)));
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                    window.setDecorFitsSystemWindows(false);
                    break;
                }
                break;
            case 6:
                ibl iblVar = (ibl) obj;
                Object obj2 = this.a;
                if (obj2 != null) {
                    list = ((iby) obj2).c;
                } else {
                    int i2 = sbp.d;
                    list = sex.a;
                }
                iblVar.e((tcu) this.c, (ShotMetadata) this.b, list, obj2 != null ? ((iby) obj2).b() : null);
                break;
            case 7:
                ibl iblVar2 = (ibl) obj;
                Object obj3 = this.a;
                if (obj3 != null) {
                    list2 = ((iby) obj3).c;
                } else {
                    int i3 = sbp.d;
                    list2 = sex.a;
                }
                iblVar2.f((InterleavedImageU8) this.c, (ShotMetadata) this.b, list2, null);
                break;
            case 8:
                Object obj4 = this.a;
                obj4.getClass();
                ((lst) obj).i((ltd) this.c, (lsy) obj4, (ltg) this.b);
                break;
            case 9:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                mbg mbgVar = (mbg) this.c;
                mbgVar.c(resolveInfo);
                String str = resolveInfo.activityInfo.packageName;
                ((mah) this.a).h();
                mbgVar.e();
                ((ArrayList) this.b).add(mbgVar.a());
                break;
            default:
                ResolveInfo resolveInfo2 = (ResolveInfo) obj;
                mbg mbgVar2 = (mbg) this.c;
                mbgVar2.c(resolveInfo2);
                String str2 = resolveInfo2.activityInfo.packageName;
                ((mah) this.a).h();
                mbgVar2.e();
                ((ArrayList) this.b).add(mbgVar2.a());
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.d) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ glw(Object obj, ShotMetadata shotMetadata, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.b = shotMetadata;
        this.a = obj2;
    }

    public /* synthetic */ glw(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ glw(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ glw(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
