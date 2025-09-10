package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserver;
import com.google.android.apps.camera.composezoom.ZoomUi;
import com.google.android.apps.camera.ui.creativebutton.CreativeButton;
import com.google.android.apps.camera.ui.supermodeswitcher.SupermodeSwitcher;
import com.google.android.apps.camera.wear.wearappv2.compose.TapToOpenCameraUi;
import com.google.android.apps.camera.wear.wearappv2.elapsedtimer.ComposeElapsedTimerUi;
import com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView;
import com.google.android.apps.camera.wear.wearappv2.ui.settings.ComposeMenuButton;
import com.google.android.apps.camera.wear.wearappv2.ui.supermodeswitcher.WearSupermodeSwitcher;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ape implements uiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ape(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r1v3, types: [bik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                ((Integer) obj2).intValue();
                int i = this.a;
                bay.af(this.b, (ayc) obj, bay.j(i | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i2 = this.a;
                aku.b(this.b, (ayc) obj, bay.j(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i3 = this.a;
                ((aqp) this.b).b((ayc) obj, bay.j(i3 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i4 = this.a;
                akg.p(this.b, (ayc) obj, bay.j(i4 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i5 = this.a;
                AmbientLifecycleObserver.AmbientLifecycleCallback.CC.h(this.b, (ayc) obj, bay.j(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i6 = this.a;
                ((dof) this.b).a((ayc) obj, bay.j(i6 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i7 = this.a;
                ((tdy) this.b).g((ayc) obj, bay.j(i7 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                int i8 = this.a;
                ((ZoomUi) this.b).a((ayc) obj, bay.j(i8 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                int i9 = this.a;
                ((CreativeButton) this.b).a((ayc) obj, bay.j(i9 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int i10 = this.a;
                ((SupermodeSwitcher) this.b).a((ayc) obj, bay.j(i10 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                int i11 = this.a;
                jsv.x(this.b, (ayc) obj, bay.j(i11 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                int i12 = this.a;
                ((TapToOpenCameraUi) this.b).a((ayc) obj, bay.j(i12 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                int i13 = this.a;
                ((ComposeElapsedTimerUi) this.b).a((ayc) obj, bay.j(i13 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                int i14 = this.a;
                jsv.v((nrl) this.b, (ayc) obj, bay.j(i14 | 1));
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj2).intValue();
                int i15 = this.a;
                ((WearCountdownView) this.b).a((ayc) obj, bay.j(i15 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                int i16 = this.a;
                ((ComposeMenuButton) this.b).a((ayc) obj, bay.j(i16 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                int i17 = this.a;
                ((nrs) this.b).B((ayc) obj, bay.j(i17 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                int i18 = this.a;
                ((nrv) this.b).B((ayc) obj, bay.j(i18 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i19 = this.a;
                ((WearSupermodeSwitcher) this.b).a((ayc) obj, bay.j(i19 | 1));
                break;
        }
        return ufg.a;
    }
}
