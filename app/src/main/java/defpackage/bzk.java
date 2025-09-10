package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bzk implements Comparator {
    public final zu a;
    public final zw b;
    public final zu c;
    public final zm d;

    public bzk() {
        long[] jArr = zv.a;
        this.a = new zu((byte[]) null);
        int i = zx.a;
        this.b = new zw((byte[]) null);
        this.c = new zu((byte[]) null);
        int i2 = zn.a;
        this.d = new zm((byte[]) null);
    }

    public final void a() {
        this.c.i();
        this.b.d();
        this.d.e();
        this.a.i();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        zu zuVar = this.c;
        View view3 = (View) zuVar.a(view);
        View view4 = (View) zuVar.a(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.a(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        zm zmVar = this.d;
        return zmVar.b(view) < zmVar.b(view2) ? -1 : 1;
    }
}
