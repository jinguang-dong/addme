package com.google.android.apps.camera.autotimer.analysis.jni;

import defpackage.poi;
import defpackage.poj;
import defpackage.rnt;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class AnalysisImage {
    private final poj a;

    /* compiled from: PG */
    class Plane implements poi {
        private final poi a;

        public Plane(poi poiVar) {
            this.a = poiVar;
        }

        @Override // defpackage.poi
        public ByteBuffer getBuffer() {
            return this.a.getBuffer();
        }

        @Override // defpackage.poi
        public int getPixelStride() {
            return this.a.getPixelStride();
        }

        @Override // defpackage.poi
        public int getRowStride() {
            return this.a.getRowStride();
        }
    }

    public AnalysisImage(poj pojVar) {
        rnt.L(pojVar.a() == 35);
        this.a = pojVar;
    }

    int getHeight() {
        return this.a.b();
    }

    Plane[] getPlanes() {
        List listG = this.a.g();
        Plane[] planeArr = new Plane[listG.size()];
        for (int i = 0; i < listG.size(); i++) {
            planeArr[i] = new Plane((poi) listG.get(i));
        }
        return planeArr;
    }

    int getWidth() {
        return this.a.c();
    }
}
