package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbu extends ContentObserver implements jhh, jhe, jhc, jgz {
    public final ContentResolver a;
    public final out b;
    public final hbw c;
    public final jgt d;
    private final boolean e;
    private final Executor f;
    private boolean g;

    public hbu(ContentResolver contentResolver, hbw hbwVar, boolean z, out outVar, jgt jgtVar, Executor executor) {
        super(null);
        this.a = contentResolver;
        this.c = hbwVar;
        this.e = z;
        this.b = outVar;
        this.d = jgtVar;
        this.f = executor;
    }

    @Override // defpackage.jhc
    public final void ea() {
        ContentResolver contentResolver = this.a;
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this);
        contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this);
    }

    @Override // defpackage.jhe
    public final void eb() {
        this.a.unregisterContentObserver(this);
        if (!this.g || this.e) {
            return;
        }
        this.g = false;
        this.c.q();
    }

    @Override // defpackage.jgz
    public final void et() {
        this.a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri, int i) {
        if (uri == null) {
            return;
        }
        this.g = true;
        boolean z2 = (i & 16) != 0;
        int i2 = i & 8;
        if (z2 || i2 != 0) {
            this.f.execute(new fie(this, z2, uri, 4));
        }
    }
}
