package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogg extends fbi implements IInterface {
    final /* synthetic */ Object a;
    final /* synthetic */ pfl b;

    public ogg() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) fbj.a(parcel, Status.CREATOR);
        fbj.b(parcel);
        ojl.aG(status, this.a, this.b);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogg(Object obj, pfl pflVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.a = obj;
        this.b = pflVar;
    }
}
