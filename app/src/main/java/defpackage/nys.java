package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.clockwork.common.wearable.wearmaterial.time.WearTimeText;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nys extends ContentObserver {
    final /* synthetic */ AmbientModeSupport.AmbientController a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nys(Handler handler, AmbientModeSupport.AmbientController ambientController) {
        super(handler);
        this.a = ambientController;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        ((WearTimeText) this.a.a).a();
    }
}
