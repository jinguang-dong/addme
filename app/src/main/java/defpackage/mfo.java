package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfo {
    public final ppo a;
    public rwc b;
    public rwc c;
    public boolean d;
    public kpa e;
    public Optional f;
    public Optional g;

    public mfo(ppo ppoVar) {
        rvk rvkVar = rvk.a;
        this.b = rvkVar;
        this.c = rvkVar;
        this.d = false;
        this.e = kpa.c;
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.a = ppoVar;
    }

    public final void a(ExifInterface exifInterface) {
        this.b = rwc.i(exifInterface);
    }
}
