package defpackage;

import androidx.wear.ambient.WearableControllerProvider;
import com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView;
import com.google.android.apps.camera.wear.wearappv2.ui.settings.ComposeMenuButton;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aqb implements uiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aqb(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r1v29, types: [afy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                int i = this.a;
                ?? r0 = this.c;
                aqd.a((ccm) this.b, r0, (ayc) obj, bay.j(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i2 = this.a;
                ?? r02 = this.c;
                acv.c(this.b, r02, (ayc) obj, bay.j(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i3 = this.a;
                ?? r03 = this.c;
                akg.o(this.b, r03, (ayc) obj, bay.j(i3 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i4 = this.a;
                ?? r04 = this.c;
                auv.a((cdo) this.b, r04, (ayc) obj, bay.j(i4 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i5 = this.a;
                ?? r05 = this.c;
                awt.a((cdo) this.b, r05, (ayc) obj, bay.j(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i6 = this.a;
                ?? r06 = this.c;
                bay.K((bag) this.b, r06, (ayc) obj, bay.j(i6 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i7 = this.a;
                ?? r07 = this.b;
                bay.L((bag[]) this.c, r07, (ayc) obj, bay.j(i7 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                int i8 = this.a;
                Object obj3 = this.c;
                ((bfh) this.b).c(obj3, (ayc) obj, bay.j(i8) | 1);
                break;
            case 8:
                ((Integer) obj2).intValue();
                int i9 = this.a;
                Object obj4 = this.b;
                ((djk) this.c).h((kbz) obj4, (ayc) obj, bay.j(i9 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int i10 = this.a;
                Object obj5 = this.b;
                ((djk) this.c).h((kbz) obj5, (ayc) obj, bay.j(i10 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                int i11 = this.a;
                ?? r08 = this.c;
                WearableControllerProvider.f(this.b, r08, (ayc) obj, bay.j(i11 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                int i12 = this.a;
                ?? r09 = this.c;
                drp.a((cdo) this.b, r09, (ayc) obj, bay.j(i12 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                int i13 = this.a;
                ?? r010 = this.c;
                ((ned) this.b).b(r010, (ayc) obj, bay.j(i13 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                int i14 = this.a;
                ?? r011 = this.c;
                ((nei) this.b).b(r011, (ayc) obj, bay.j(i14 | 1));
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj2).intValue();
                int i15 = this.a;
                Object obj6 = this.c;
                ((WearCountdownView) this.b).e((String) obj6, (ayc) obj, bay.j(i15 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                int i16 = this.a;
                Object obj7 = this.c;
                ((WearCountdownView) this.b).f((nrm) obj7, (ayc) obj, bay.j(i16 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                int i17 = this.a;
                Object obj8 = this.c;
                ((ComposeMenuButton) this.b).e((nrx) obj8, (ayc) obj, bay.j(i17 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i18 = this.a;
                Object obj9 = this.c;
                ((ComposeMenuButton) this.b).f((nrx) obj9, (ayc) obj, bay.j(i18 | 1));
                break;
        }
        return ufg.a;
    }

    public /* synthetic */ aqb(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
