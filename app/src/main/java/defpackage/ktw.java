package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ktw extends ContentObserver {
    final /* synthetic */ ContentResolver a;
    final /* synthetic */ ktx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktw(ktx ktxVar, ContentResolver contentResolver) {
        super(null);
        this.a = contentResolver;
        this.b = ktxVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.b.d = Settings.System.getInt(this.a, "accelerometer_rotation", 0) == 1;
    }
}
