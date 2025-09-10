package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czt {
    public final int a;
    public final cyr b;
    public final int c;
    public boolean i;
    public byte[] j;
    public final boolean l = false;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Deque g = new ArrayDeque();
    public final Deque h = new ArrayDeque();
    public long k = -9223372036854775807L;

    public czt(int i, cyr cyrVar, int i2) {
        this.a = i;
        this.b = cyrVar;
        this.c = i2;
    }

    public final int a() {
        return cyv.b(this.b.h) ? 48000 : 90000;
    }
}
