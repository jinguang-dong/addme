package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eff extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new ak(20);
    public String a;
    public int b;
    public float c;
    public boolean d;
    public String e;
    public int f;
    public int g;

    public eff(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readInt() == 1;
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public eff(Parcelable parcelable) {
        super(parcelable);
    }
}
