package defpackage;

import android.view.ViewGroup;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmj implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public fmj(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final ViewGroup b() {
        return this.b != 0 ? (ViewGroup) new ocq(((nns) this.a).a()).c(R.id.viewfinder_frame) : (ViewGroup) new ocq(((nns) this.a).a()).c(R.id.viewfinder_frame);
    }
}
