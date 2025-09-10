package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azy implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azz createFromParcel(Parcel parcel, ClassLoader classLoader) {
        bap bapVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            bapVar = bap.b;
        } else if (i == 1) {
            bapVar = bap.c;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.bE(i, "Unsupported MutableState policy ", " was restored"));
            }
            bapVar = bap.a;
        }
        return new azz(value, bapVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new azz[i];
    }
}
