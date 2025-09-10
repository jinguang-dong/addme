package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onn extends fbi implements IInterface {
    final /* synthetic */ ogn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onn(ogn ognVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.a = ognVar;
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        fbj.b(parcel);
        this.a.b(new omn(bArrCreateByteArray, 2));
        return true;
    }

    public onn() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }
}
