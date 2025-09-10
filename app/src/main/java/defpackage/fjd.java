package defpackage;

import android.os.VibrationEffect;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fjd extends gsn {
    final /* synthetic */ fje a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjd(fje fjeVar) {
        super((int[]) null);
        this.a = fjeVar;
    }

    @Override // defpackage.gsn
    public final void a() {
        VibrationEffect vibrationEffect = fje.a;
        fje fjeVar = this.a;
        fjeVar.l.c(R.raw.all_in_cancel);
        fjeVar.n.h(fje.a);
        fjeVar.c(fjl.BY_USER);
    }
}
