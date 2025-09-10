package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyn extends tyd {
    public static final Parcelable.Creator CREATOR = new tyo(1);
    public int a;
    public int b;
    public float c;
    public float f;

    public tyn() {
    }

    @Override // defpackage.tyd
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tyd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f);
    }

    public tyn(Parcel parcel) {
        a(parcel);
    }
}
