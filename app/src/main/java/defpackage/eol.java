package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eol extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new hbs(1);
    public boolean a;
    public boolean b;

    public eol(Parcel parcel) {
        super(parcel);
        this.a = ((Boolean) parcel.readValue(null)).booleanValue();
        this.b = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "MainSwitchBar.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " checked=" + this.a + " visible=" + this.b + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.a));
        parcel.writeValue(Boolean.valueOf(this.b));
    }

    public eol(Parcelable parcelable) {
        super(parcelable);
    }
}
