package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class txt implements Parcelable {
    public byte[] a;

    public txt() {
        this.a = null;
    }

    public final void a(tqr tqrVar) {
        int iK;
        if (tqrVar != null) {
            tph tphVar = (tph) tqrVar;
            if (tphVar.C()) {
                iK = tphVar.k(null);
                if (iK < 0) {
                    throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
                }
            } else {
                int iK2 = tphVar.aV & Integer.MAX_VALUE;
                if (iK2 == Integer.MAX_VALUE) {
                    iK2 = tphVar.k(null);
                    if (iK2 < 0) {
                        throw new IllegalStateException(a.bv(iK2, "serialized size must be non-negative, was "));
                    }
                    tphVar.aV = (tphVar.aV & Integer.MIN_VALUE) | iK2;
                }
                iK = iK2;
            }
            if (iK != 0) {
                this.a = tqrVar.h();
                return;
            }
        }
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof txt) && Arrays.equals(((txt) obj).a, this.a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        byte[] bArr = this.a;
        return a.bE(bArr == null ? 0 : bArr.length, "ParcelableProtoLite[", " bytes]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }

    protected txt(Parcel parcel) {
        this.a = null;
        this.a = parcel.createByteArray();
    }
}
