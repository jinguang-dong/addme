package com.google.android.apps.camera.ui.hotshot.logging;

import defpackage.lig;
import defpackage.sbp;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HotshotUsage {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public Optional c = Optional.empty();
    public Instant d = Instant.MAX;
    private Instant e = Instant.MAX;

    private void dumpImageCaptionStats() {
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return;
            }
            List list2 = (List) list.get(i);
            list2.size();
            for (int i2 = 0; i2 < list2.size(); i2++) {
            }
            i++;
        }
    }

    public final void a() {
        this.e = Instant.MAX;
        this.a.clear();
    }

    public final void b() {
        if (d()) {
            this.e = Instant.now();
        }
    }

    public final void c() {
        if (d() && Instant.now().isAfter(this.e)) {
            this.c.ifPresent(new lig(7));
            this.c = Optional.empty();
            this.b.add(sbp.j(this.a));
            a();
        }
    }

    public final boolean d() {
        return Instant.now().isAfter(this.d);
    }
}
