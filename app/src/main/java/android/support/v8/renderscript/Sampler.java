package android.support.v8.renderscript;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Sampler extends BaseObj {
    float mAniso;
    Value mMag;
    Value mMin;
    Value mWrapR;
    Value mWrapS;
    Value mWrapT;

    /* compiled from: PG */
    public class Builder {
        float mAniso;
        Value mMag;
        Value mMin;
        RenderScript mRS;
        Value mWrapR;
        Value mWrapS;
        Value mWrapT;

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
            Value value = Value.NEAREST;
            this.mMin = value;
            this.mMag = value;
            Value value2 = Value.WRAP;
            this.mWrapS = value2;
            this.mWrapT = value2;
            this.mWrapR = value2;
            this.mAniso = 1.0f;
        }

        public Sampler create() {
            this.mRS.validate();
            Sampler sampler = new Sampler(this.mRS.nSamplerCreate(this.mMag.mID, this.mMin.mID, this.mWrapS.mID, this.mWrapT.mID, this.mWrapR.mID, this.mAniso), this.mRS);
            sampler.mMin = this.mMin;
            sampler.mMag = this.mMag;
            sampler.mWrapS = this.mWrapS;
            sampler.mWrapT = this.mWrapT;
            sampler.mWrapR = this.mWrapR;
            sampler.mAniso = this.mAniso;
            return sampler;
        }

        public void setAnisotropy(float f) {
            if (f < 0.0f) {
                throw new IllegalArgumentException("Invalid value");
            }
            this.mAniso = f;
        }

        public void setMagnification(Value value) {
            if (value != Value.NEAREST && value != Value.LINEAR) {
                throw new IllegalArgumentException("Invalid value");
            }
            this.mMag = value;
        }

        public void setMinification(Value value) {
            if (value != Value.NEAREST && value != Value.LINEAR && value != Value.LINEAR_MIP_LINEAR && value != Value.LINEAR_MIP_NEAREST) {
                throw new IllegalArgumentException("Invalid value");
            }
            this.mMin = value;
        }

        public void setWrapS(Value value) {
            if (value != Value.WRAP && value != Value.CLAMP && value != Value.MIRRORED_REPEAT) {
                throw new IllegalArgumentException("Invalid value");
            }
            this.mWrapS = value;
        }

        public void setWrapT(Value value) {
            if (value != Value.WRAP && value != Value.CLAMP && value != Value.MIRRORED_REPEAT) {
                throw new IllegalArgumentException("Invalid value");
            }
            this.mWrapT = value;
        }
    }

    /* compiled from: PG */
    public enum Value {
        NEAREST(0),
        LINEAR(1),
        LINEAR_MIP_LINEAR(2),
        LINEAR_MIP_NEAREST(5),
        WRAP(3),
        CLAMP(4),
        MIRRORED_REPEAT(6);

        int mID;

        Value(int i) {
            this.mID = i;
        }
    }

    public Sampler(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static Sampler CLAMP_LINEAR(RenderScript renderScript) {
        if (renderScript.mSampler_CLAMP_LINEAR == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.LINEAR);
            builder.setMagnification(Value.LINEAR);
            builder.setWrapS(Value.CLAMP);
            builder.setWrapT(Value.CLAMP);
            renderScript.mSampler_CLAMP_LINEAR = builder.create();
        }
        return renderScript.mSampler_CLAMP_LINEAR;
    }

    public static Sampler CLAMP_LINEAR_MIP_LINEAR(RenderScript renderScript) {
        if (renderScript.mSampler_CLAMP_LINEAR_MIP_LINEAR == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.LINEAR_MIP_LINEAR);
            builder.setMagnification(Value.LINEAR);
            builder.setWrapS(Value.CLAMP);
            builder.setWrapT(Value.CLAMP);
            renderScript.mSampler_CLAMP_LINEAR_MIP_LINEAR = builder.create();
        }
        return renderScript.mSampler_CLAMP_LINEAR_MIP_LINEAR;
    }

    public static Sampler CLAMP_NEAREST(RenderScript renderScript) {
        if (renderScript.mSampler_CLAMP_NEAREST == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.NEAREST);
            builder.setMagnification(Value.NEAREST);
            builder.setWrapS(Value.CLAMP);
            builder.setWrapT(Value.CLAMP);
            renderScript.mSampler_CLAMP_NEAREST = builder.create();
        }
        return renderScript.mSampler_CLAMP_NEAREST;
    }

    public static Sampler MIRRORED_REPEAT_LINEAR(RenderScript renderScript) {
        if (renderScript.mSampler_MIRRORED_REPEAT_LINEAR == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.LINEAR);
            builder.setMagnification(Value.LINEAR);
            builder.setWrapS(Value.MIRRORED_REPEAT);
            builder.setWrapT(Value.MIRRORED_REPEAT);
            renderScript.mSampler_MIRRORED_REPEAT_LINEAR = builder.create();
        }
        return renderScript.mSampler_MIRRORED_REPEAT_LINEAR;
    }

    public static Sampler MIRRORED_REPEAT_NEAREST(RenderScript renderScript) {
        if (renderScript.mSampler_MIRRORED_REPEAT_NEAREST == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.NEAREST);
            builder.setMagnification(Value.NEAREST);
            builder.setWrapS(Value.MIRRORED_REPEAT);
            builder.setWrapT(Value.MIRRORED_REPEAT);
            renderScript.mSampler_MIRRORED_REPEAT_NEAREST = builder.create();
        }
        return renderScript.mSampler_MIRRORED_REPEAT_NEAREST;
    }

    public static Sampler WRAP_LINEAR(RenderScript renderScript) {
        if (renderScript.mSampler_WRAP_LINEAR == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.LINEAR);
            builder.setMagnification(Value.LINEAR);
            builder.setWrapS(Value.WRAP);
            builder.setWrapT(Value.WRAP);
            renderScript.mSampler_WRAP_LINEAR = builder.create();
        }
        return renderScript.mSampler_WRAP_LINEAR;
    }

    public static Sampler WRAP_LINEAR_MIP_LINEAR(RenderScript renderScript) {
        if (renderScript.mSampler_WRAP_LINEAR_MIP_LINEAR == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.LINEAR_MIP_LINEAR);
            builder.setMagnification(Value.LINEAR);
            builder.setWrapS(Value.WRAP);
            builder.setWrapT(Value.WRAP);
            renderScript.mSampler_WRAP_LINEAR_MIP_LINEAR = builder.create();
        }
        return renderScript.mSampler_WRAP_LINEAR_MIP_LINEAR;
    }

    public static Sampler WRAP_NEAREST(RenderScript renderScript) {
        if (renderScript.mSampler_WRAP_NEAREST == null) {
            Builder builder = new Builder(renderScript);
            builder.setMinification(Value.NEAREST);
            builder.setMagnification(Value.NEAREST);
            builder.setWrapS(Value.WRAP);
            builder.setWrapT(Value.WRAP);
            renderScript.mSampler_WRAP_NEAREST = builder.create();
        }
        return renderScript.mSampler_WRAP_NEAREST;
    }

    public float getAnisotropy() {
        return this.mAniso;
    }

    public Value getMagnification() {
        return this.mMag;
    }

    public Value getMinification() {
        return this.mMin;
    }

    public Value getWrapS() {
        return this.mWrapS;
    }

    public Value getWrapT() {
        return this.mWrapT;
    }
}
