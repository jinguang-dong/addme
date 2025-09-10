package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orc extends oix {
    public static final Parcelable.Creator CREATOR = new oks(9);
    final ord a;
    final int b;
    final int c;
    final int d;

    public orc(ord ordVar, int i, int i2, int i3) {
        this.a = ordVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(opw opwVar) {
        int i = this.b;
        if (i == 1) {
            opwVar.b(this.a);
            return;
        }
        if (i == 2) {
            opwVar.c(this.a);
            return;
        }
        if (i == 3) {
            opwVar.d(this.a);
        } else if (i != 4) {
            Log.w("ChannelEventParcelable", a.bv(i, "Unknown type: "));
        } else {
            opwVar.e(this.a);
        }
    }

    public final String toString() {
        int i = this.b;
        String strValueOf = String.valueOf(this.a);
        String string = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        return "ChannelEventParcelable[, channel=" + strValueOf + ", type=" + string + ", closeReason=" + (i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL") + ", appErrorCode=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.I(parcel, 2, this.a, i);
        ojl.A(parcel, 3, this.b);
        ojl.A(parcel, 4, this.c);
        ojl.A(parcel, 5, this.d);
        ojl.w(parcel, iU);
    }
}
