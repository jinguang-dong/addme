package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oku extends ohx {
    public final Context t;

    public oku(Context context, Looper looper, oeu oeuVar, oev oevVar, ohp ohpVar) {
        super(context, looper, 29, ohpVar, oeuVar, oevVar);
        this.t = context;
        ouf.b(context);
    }

    @Override // defpackage.ohm
    public final boolean D() {
        return true;
    }

    @Override // defpackage.ohx, defpackage.ohm, defpackage.oeo
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.ohm
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof okv ? (okv) iInterfaceQueryLocalInterface : new okv(iBinder);
    }

    @Override // defpackage.ohm
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.ohm
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.ohm
    public final odl[] e() {
        return okh.b;
    }
}
