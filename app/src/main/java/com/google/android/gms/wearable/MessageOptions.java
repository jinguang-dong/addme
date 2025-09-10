package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.azu;
import defpackage.oix;
import defpackage.ojl;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MessageOptions extends oix implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new azu(12);
    public final int a;

    public MessageOptions(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MessageOptions) && this.a == ((MessageOptions) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "MessageOptions[ priority=" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, i2);
        ojl.w(parcel, iU);
    }
}
