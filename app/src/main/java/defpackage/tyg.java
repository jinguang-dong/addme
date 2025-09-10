package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyg extends tyd {
    public static final Parcelable.Creator CREATOR = new ouh(16);
    public float a;
    public float b;
    public float c;

    public tyg() {
    }

    @Override // defpackage.tyd
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.tyd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public tyg(Parcel parcel) {
        a(parcel);
    }
}
