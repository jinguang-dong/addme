package defpackage;

import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fbu implements nls {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nls
    public final void a(rwc rwcVar) {
        switch (this.b) {
            case 0:
                ((fbv) this.a).t = rvk.a;
                break;
            case 1:
                ((fbv) this.a).s = rvk.a;
                break;
            case 2:
                ((fce) this.a).e = null;
                break;
            case 3:
                ((fce) this.a).d = null;
                break;
            case 4:
                ((fce) ((fcu) this.a).a).e = null;
                break;
            case 5:
                ((fcl) this.a).a = null;
                break;
            case 6:
                ((fcl) ((fco) this.a).a).b = null;
                break;
            case 7:
                ((fcp) this.a).a = null;
                break;
            case 8:
                ((fcp) ((fco) this.a).a).b = null;
                break;
            case 9:
                ((fcv) this.a).f = null;
                break;
            case 10:
                ((fcv) ((fcu) this.a).a).g = null;
                break;
            case 11:
                ((FocusIndicatorView) this.a).l.set(true);
                break;
            case 12:
                ((FocusIndicatorView) this.a).l.set(false);
                break;
            case 13:
                ((FocusIndicatorView) this.a).l.set(false);
                break;
            default:
                ((FocusIndicatorView) this.a).l.set(false);
                break;
        }
    }
}
